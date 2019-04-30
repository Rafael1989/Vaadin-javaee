package pt.confidentia.rafael.ui.views.admin.user;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.ComboBoxElement;
import com.vaadin.testbench.elements.GridElement;
import com.vaadin.testbench.elements.TextFieldElement;
import com.vaadin.testbench.elements.VerticalLayoutElement;
import com.vaadin.testbench.elementsbase.ServerClass;

@ServerClass("pt.confidentia.rafael.ui.views.admin.user.UserAdminViewDesign")
@AutoGenerated
public class UserAdminViewDesignElement extends VerticalLayoutElement {

	public TextFieldElement getSearch() {
		return $(com.vaadin.testbench.elements.TextFieldElement.class).id("search");
	}

	public ButtonElement getAdd() {
		return $(com.vaadin.testbench.elements.ButtonElement.class).id("add");
	}

	public GridElement getList() {
		return $(com.vaadin.testbench.elements.GridElement.class).id("list");
	}

	public VerticalLayoutElement getForm() {
		return $(com.vaadin.testbench.elements.VerticalLayoutElement.class).id("form");
	}

	public TextFieldElement getEmail() {
		return $(com.vaadin.testbench.elements.TextFieldElement.class).id("email");
	}

	public TextFieldElement getName() {
		return $(com.vaadin.testbench.elements.TextFieldElement.class).id("name");
	}

	public TextFieldElement getPassword() {
		return $(com.vaadin.testbench.elements.TextFieldElement.class).id("password");
	}

	public ComboBoxElement getRole() {
		return $(com.vaadin.testbench.elements.ComboBoxElement.class).id("role");
	}

	public ButtonElement getUpdate() {
		return $(com.vaadin.testbench.elements.ButtonElement.class).id("update");
	}

	public ButtonElement getCancel() {
		return $(com.vaadin.testbench.elements.ButtonElement.class).id("cancel");
	}

	public ButtonElement getDelete() {
		return $(com.vaadin.testbench.elements.ButtonElement.class).id("delete");
	}
}