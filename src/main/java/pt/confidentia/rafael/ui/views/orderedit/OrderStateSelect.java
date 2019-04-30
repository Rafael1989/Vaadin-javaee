package pt.confidentia.rafael.ui.views.orderedit;

import com.vaadin.cdi.ViewScoped;
import pt.confidentia.rafael.app.HasLogger;
import pt.confidentia.rafael.backend.data.OrderState;
import com.vaadin.ui.ComboBox;

@ViewScoped
public class OrderStateSelect extends ComboBox<OrderState> implements HasLogger {

	public OrderStateSelect() {
		setEmptySelectionAllowed(false);
		setTextInputAllowed(false);
		setItems(OrderState.values());
		setItemCaptionGenerator(OrderState::getDisplayName);
	}

}
