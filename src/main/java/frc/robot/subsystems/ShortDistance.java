package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShortDistance extends SubsystemBase {
    public ShortDistance(){

    }

    AnalogInput sensor = new AnalogInput(0);


    public boolean distance(){
        double volts = sensor.getVoltage();
        double distance = 24.4 * (Math.pow(0.18, volts))+ 0.3;
        //return distance;
        if(distance >= 0 && distance <= 15){
            return true;
        }
        return false;
    }
    
    @Override
    public void periodic()
    {
        SmartDashboard.putBoolean("shortDistance", distance());
    }
}