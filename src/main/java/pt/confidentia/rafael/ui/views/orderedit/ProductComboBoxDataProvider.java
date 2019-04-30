package pt.confidentia.rafael.ui.views.orderedit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.vaadin.data.provider.Query;
import com.vaadin.data.provider.QuerySortOrder;
import com.vaadin.shared.data.sort.SortDirection;
import pt.confidentia.rafael.backend.data.entity.Product;
import pt.confidentia.rafael.backend.service.ProductService;
import pt.confidentia.rafael.ui.components.FilterablePageableDataProvider;

@Dependent
public class ProductComboBoxDataProvider extends FilterablePageableDataProvider<Product, String> {

	private final ProductService productService;

	@Inject
	public ProductComboBoxDataProvider(ProductService productService) {
		this.productService = productService;
	}

	@Override
	protected Stream<Product> fetchFromBackEnd(Query<Product, String> query, List<QuerySortOrder> sortOrders) {
		return productService.findAnyMatching(query.getFilter(), query.getOffset(), query.getLimit(), sortOrders);
	}

	@Override
	protected int sizeInBackEnd(Query<Product, String> query) {
		return (int) productService.countAnyMatching(query.getFilter());
	}

	@Override
	protected List<QuerySortOrder> getDefaultSortOrders() {
		List<QuerySortOrder> sortOrders = new ArrayList<>();
		sortOrders.add(new QuerySortOrder("name", SortDirection.ASCENDING));
		return sortOrders;
	}

}
