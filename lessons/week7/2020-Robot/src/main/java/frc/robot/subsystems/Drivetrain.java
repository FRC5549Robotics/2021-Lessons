/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends SubsystemBase {
  // Motors
  WPI_TalonSRX frontLeft, frontRight, backLeft, backRight;

  // Speed Controller Groups
  SpeedControllerGroup frontMotors, backMotors;

  // Differential Drive
  DifferentialDrive drive;

  public Drivetrain() {
    frontLeft = new WPI_TalonSRX(0);
    frontRight = new WPI_TalonSRX(1);
    backLeft = new WPI_TalonSRX(2);
    backRight = new WPI_TalonSRX(3);

    frontMotors = new SpeedControllerGroup(frontLeft, frontRight);
    backMotors = new SpeedControllerGroup(backLeft, backRight);

    drive = new DifferentialDrive(frontMotors, backMotors);
  }

  public void arcadeDrive(xAxis, zAxis) {
    drive.arcadeDrive(xAxis, zAxis);
  }
}
