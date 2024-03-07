package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BreakSensor extends SubsystemBase {

    private DigitalInput digitalInput;

    public BreakSensor() {
        digitalInput = new DigitalInput(0);
    }

// make sensor object
// make a method that returns true when sensor senses line is broken with a default return of false
    public boolean break1(){
        return !digitalInput.get();
    }

    
    @Override
    public void periodic()
    {
        SmartDashboard.putBoolean("breakSensor", break1());
    }


}
