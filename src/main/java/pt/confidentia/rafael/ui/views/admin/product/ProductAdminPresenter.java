package pt.confidentia.rafael.ui.views.admin.product;

import javax.inject.Inject;

import com.vaadin.cdi.ViewScoped;
import pt.confidentia.rafael.backend.data.entity.Product;
import pt.confidentia.rafael.backend.service.ProductService;
import pt.confidentia.rafael.ui.navigation.NavigationManager;
import pt.confidentia.rafael.ui.views.admin.AbstractCrudPresenter;

@ViewScoped
public class ProductAdminPresenter extends AbstractCrudPresenter<Product, ProductService, ProductAdminView> {

	@Inject
	public ProductAdminPresenter(ProductAdminDataProvider productAdminDataProvider, NavigationManager navigationManager,
			ProductService service) {
		super(navigationManager, service, Product.class, productAdminDataProvider);
	}
}
