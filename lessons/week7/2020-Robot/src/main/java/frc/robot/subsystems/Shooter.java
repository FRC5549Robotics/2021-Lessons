/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Shooter extends SubsystemBase {
  // Motors
  WPI_TalonSRX topMotor1, topMotor2, bottomMotor1, bottomMotor2;

  // Speed Controller Group
  SpeedControllerGroup topMotors, bottomMotors;

  public Shooter() {
    topMotor1 = new WPI_TalonSRX(8);
    topMotor2 = new WPI_TalonSRX(9);
    bottomMotor1 = new WPI_TalonSRX(10);
    bottomMotor2 = new WPI_TalonSRX(11);

    topMotors = new SpeedControllerGroup(topMotor1, topMotor2);
    bottomMotors = new SpeedControllerGroup(bottomMotor1, bottomMotor2);
  }

  public void run() {
    topMotors.run(1);
    bottomMotors.run(1);
  }

  public void stop() {
    topMotors.set(0);
    bottomMotors.run(0);
  }

}
