package frc.robot.Commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.MotorTester;

public class Motor_Commands {
    private MotorTester motor;
    public Motor_Commands(MotorTester motor){
        this.motor = motor;
    }

    public InstantCommand setMotor(DoubleSupplier motorSpeed){
        return new InstantCommand(()-> motor.setSpeed(motorSpeed.getAsDouble()), motor);
    }


}
