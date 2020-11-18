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

public class Indexer extends SubsystemBase {
  // Motors
  WPI_TalonSRX indexerMotor1, indexerMotor2;

  // Speed Controller Group
  SpeedControllerGroup indexerMotors;

  public Indexer() {
    indexerMotor1 = new WPI_TalonSRX(6);
    indexerMotor2 = new WPI_TalonSRX(7);

    indexerMotors = SpeedControllerGroup(indexerMotor1, indexerMotor2);
  }

  public void run() {
    indexerMotors.run(1);
  }

  public void stop() {
    indexerMotors.set(0);
  }
}
