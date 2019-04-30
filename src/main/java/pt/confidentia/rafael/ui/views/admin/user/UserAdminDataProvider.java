package pt.confidentia.rafael.ui.views.admin.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.vaadin.data.provider.Query;
import com.vaadin.data.provider.QuerySortOrder;
import com.vaadin.shared.data.sort.SortDirection;
import pt.confidentia.rafael.backend.data.entity.User;
import pt.confidentia.rafael.backend.service.UserService;
import pt.confidentia.rafael.ui.components.FilterablePageableDataProvider;

@Dependent
public class UserAdminDataProvider extends FilterablePageableDataProvider<User, Object> {

	private final UserService userService;

	@Inject
	public UserAdminDataProvider(UserService userService) {
		this.userService = userService;
	}

	@Override
	protected Stream<User> fetchFromBackEnd(Query<User, Object> query, List<QuerySortOrder> sortOrders) {
		return userService.findAnyMatching(getOptionalFilter(), query.getOffset(), query.getLimit(), sortOrders);
	}

	@Override
	protected int sizeInBackEnd(Query<User, Object> query) {
		return (int) userService.countAnyMatching(getOptionalFilter());
	}

	@Override
	protected List<QuerySortOrder> getDefaultSortOrders() {
		List<QuerySortOrder> sortOrders = new ArrayList<>();
		sortOrders.add(new QuerySortOrder("email", SortDirection.ASCENDING));
		return sortOrders;
	}

}