import com.SwingMVCCalculator.Controller.CalculatorController;
import com.SwingMVCCalculator.Model.CalculatorModel;
import com.SwingMVCCalculator.View.PlainSourceCalculatorView;
import com.SwingMVCCalculator.View.WindowBuilderCalculatorView;

public class SwingMVCCalculator {

	public static void main(String[] args) {
		WindowBuilderCalculatorView view = new WindowBuilderCalculatorView();
		CalculatorModel calculator = new CalculatorModel();
		CalculatorController controller = new CalculatorController(view,calculator);
		view.setVisible(true);
	}

}
