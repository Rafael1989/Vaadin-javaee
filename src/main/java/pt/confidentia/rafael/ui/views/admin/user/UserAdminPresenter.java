package pt.confidentia.rafael.ui.views.admin.user;

import java.io.Serializable;

import javax.inject.Inject;

import com.vaadin.cdi.ViewScoped;
import pt.confidentia.rafael.backend.data.entity.User;
import pt.confidentia.rafael.backend.service.UserService;
import pt.confidentia.rafael.ui.navigation.NavigationManager;
import pt.confidentia.rafael.ui.views.admin.AbstractCrudPresenter;

@ViewScoped
public class UserAdminPresenter extends AbstractCrudPresenter<User, UserService, UserAdminView>
		implements Serializable {

	@Inject
	public UserAdminPresenter(UserAdminDataProvider userAdminDataProvider, NavigationManager navigationManager,
			UserService service) {
		super(navigationManager, service, User.class, userAdminDataProvider);
	}

	public String encodePassword(String value) {
		return getService().encodePassword(value);
	}

	@Override
	protected void editItem(User item) {
		super.editItem(item);
		getView().setPasswordRequired(item.isNew());
	}
}