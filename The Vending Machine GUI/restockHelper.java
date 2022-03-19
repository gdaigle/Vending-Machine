import java.util.TimerTask;
public class restockHelper extends TimerTask{
	@Override
	public void run() {
		VMachineFrame.vmachine.frame.setVisible(true);
	}
}
