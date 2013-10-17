package timelogger.control.operation;

import java.awt.Container;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.manager.taskSubProj;

public class OperationChangeTaskConsulent implements OperationFlyweight {

	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationChangeTaskConsulent---> changing the assigned Consulent to a task");
		
		taskSubProj t = (taskSubProj) invoker;
		
		SottoProgetto sp = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoSelezionato");
		Consulente c = (Consulente) t.getComboConsulente().getSelectedItem();
		
		sp.tasks.get(Integer.parseInt(t.getLblTaskNumber().getText())-1).setConsulenteAssociato(c);
		
		//testing per vedere se SP � quello nella facade;
	}

}
