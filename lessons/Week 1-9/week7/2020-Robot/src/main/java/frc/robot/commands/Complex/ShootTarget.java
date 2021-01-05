/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Complex;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.commands.Simple.Index;
import frc.robot.commands.Simple.Intake;
import frc.robot.commands.Simple.Shoot;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Shooter;

public class ShootTarget extends ParallelCommandGroup {
  public ShootTarget(Shooter m_shooter, Intake m_intake, Index m_index) {
    super(
      new Shoot(m_shooter),
      new Intake(m_intake),
      new Index(m_index),
    );
  }
}
