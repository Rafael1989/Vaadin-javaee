package pt.confidentia.rafael.ui.views.orderedit;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import pt.confidentia.rafael.backend.data.entity.PickupLocation;
import com.vaadin.ui.ComboBox;

@Dependent
public class PickupLocationComboBox extends ComboBox<PickupLocation> {

	private final PickupLocationComboBoxDataProvider dataProvider;

	@Inject
	public PickupLocationComboBox(PickupLocationComboBoxDataProvider dataProvider) {
		this.dataProvider = dataProvider;
		setEmptySelectionAllowed(false);
		setTextInputAllowed(false);
		setPlaceholder("Pickup location");
		setItemCaptionGenerator(PickupLocation::getName);
	}

	@PostConstruct
	private void initDataProvider() {
		setDataProvider(dataProvider);
	}

}
