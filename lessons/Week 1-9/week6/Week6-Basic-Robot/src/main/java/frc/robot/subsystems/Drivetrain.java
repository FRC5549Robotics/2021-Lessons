package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends SubsystemBase { 
  /**
   * Drivetrain
   */
  WPI_TalonSRX frontLeft, frontRight, backLeft, backRight;
  SpeedControllerGroup left, right;
  DifferentialDrive drive;
  

  public Drivetrain() {
    // Motors 
    frontLeft = new WPI_TalonSRX(0);
    frontRight = new WPI_TalonSRX(1);
    backLeft = new WPI_TalonSRX(2);
    backRight = new WPI_TalonSRX(3);

    // Speed Controller Groups
    left = new SpeedControllerGroup(frontLeft, backLeft);
    right = new SpeedControllerGroup(frontRight, backRight);

    // Drive Train
    drive = new DifferentialDrive(left, right);
  }

  public void arcadeDrive(double joystickAxis, double joystickRotation) {
    drive.arcadeDrive(joystickAxis, joystickRotation);
  }
}
