package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LightSensor extends SubsystemBase{
    private DigitalInput digitalInput;

    public LightSensor() {
        digitalInput = new DigitalInput(3);
    }

// make sensor object
// make a method that returns true when sensor senses line is broken with a default return of false
    public boolean light(){
        return !digitalInput.get();
    }

    
    @Override
    public void periodic()
    {
        SmartDashboard.putBoolean("LightSensor", light());
    }
}
