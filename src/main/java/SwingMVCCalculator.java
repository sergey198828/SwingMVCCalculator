import com.SwingMVCCalculator.Controller.CalculatorController;
import com.SwingMVCCalculator.Model.CalculatorModel;
import com.SwingMVCCalculator.View.CalculatorView;

public class SwingMVCCalculator {

	public static void main(String[] args) {
		CalculatorView view = new CalculatorView();
		CalculatorModel calculator = new CalculatorModel();
		CalculatorController controller = new CalculatorController(view,calculator);
		view.setVisible(true);
	}

}
