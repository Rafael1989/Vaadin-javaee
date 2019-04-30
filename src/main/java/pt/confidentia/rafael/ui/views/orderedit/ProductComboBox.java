package pt.confidentia.rafael.ui.views.orderedit;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import pt.confidentia.rafael.backend.data.entity.Product;
import com.vaadin.ui.ComboBox;

@Dependent
public class ProductComboBox extends ComboBox<Product> {

	@Inject
	public ProductComboBox(ProductComboBoxDataProvider dataProvider) {
		setWidth("100%");
		setEmptySelectionAllowed(false);
		setPlaceholder("Product");
		setItemCaptionGenerator(Product::getName);
		setDataProvider(dataProvider);
	}

}
