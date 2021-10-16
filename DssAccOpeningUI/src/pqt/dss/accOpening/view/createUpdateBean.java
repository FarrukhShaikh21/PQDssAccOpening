package pqt.dss.accOpening.view;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.event.LaunchPopupEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlLOVBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class createUpdateBean {
    public createUpdateBean() {
    }

    public void earchAgentLov(LaunchPopupEvent launchPopupEvent) {
//         Add event code here...
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
               OperationBinding operation = bindings.getOperationBinding("SearchAgent");
               Object VAgentCode = operation.execute();
               FacesCtrlLOVBinding lov = (FacesCtrlLOVBinding) bindings.get("AgentCode");
               String wcl = "V_AGENT_CODE NOT IN ("+ VAgentCode +")";
               lov.getListIterBinding().getViewObject().setWhereClause(wcl);
        }
   
}
