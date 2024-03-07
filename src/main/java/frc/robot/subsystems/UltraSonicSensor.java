package frc.robot.subsystems;

import edu.wpi.first.math.filter.MedianFilter;
import edu.wpi.first.units.Units;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class UltraSonicSensor extends SubsystemBase {
    Ultrasonic sensor = new Ultrasonic(2, 1);
    private final MedianFilter filter = new MedianFilter(5);
    public UltraSonicSensor(){
        sensor.setEnabled(true);
        Ultrasonic.setAutomaticMode(true);
    }

    public double calculate(){
        System.out.println(sensor.getRangeInches());
        double measure = filter.calculate(sensor.getRangeInches());
        return measure;
    }
    public boolean inDistance(){
        double measure = calculate();
        if(measure >= 0 && measure <= 5){
            return true;
        }
        return false;
    }
    
    @Override
    public void periodic(){
        //System.out.println(calculate());
        SmartDashboard.putBoolean("Ultrasonic", inDistance());
    }
}
