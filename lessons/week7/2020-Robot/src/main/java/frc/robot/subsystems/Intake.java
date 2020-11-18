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
  // Motors
  WPI_TalonSRX topIntake, bottomIntake;

  // Speed Controller Group
  SpeedControllerGroup intakeMotors;

  public Intake() {
    topIntake = new WPI_TalonSRX(4);
    bottomIntake = new WPI_TalonSRX(5);

    intakeMotors = new SpeedControllerGroup(topIntake, -bottomIntake);
  }

  public void run() {
    intakeMotors.run(1);
  }

  public void stop() {
    intakeMotors.set(0);
  }
}
