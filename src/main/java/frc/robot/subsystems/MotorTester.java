package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorTester extends SubsystemBase {

    private TalonSRX motor = new TalonSRX(1);
    public MotorTester(){
        
    }

    public void setSpeed(double speed){
        motor.set(TalonSRXControlMode.PercentOutput, speed);
    }

    
}
