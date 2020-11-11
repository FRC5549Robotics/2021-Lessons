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

public class Intake extends SubsystemBase {
  /**
   * Intake.
   */

  WPI_TalonSRX top, bottom;
  SpeedControllerGroup intakeMotors;
  
  public Intake() {
    // Motors
    top = new WPI_TalonSRX(4);
    bottom = new WPI_TalonSRX(5);

    // Speed Controller Group
    intakeMotors = new SpeedControllerGroup(top, -bottom)
  }

  public void intake() {
    intakeMotors.run(1);
  }

  public void output() {
    intakeMotors.run(-1);
  }

  public void stop() {
    intakeMotors.run(0);
  }
}
