/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class Intake extends CommandBase {
  private final Intake m_intake;

  public Intake(Intake intake) {
    m_intake = intake;
    addRequirements(intake);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    m_intake.run();
  }

  @Override
  public void end(boolean interrupted) {
    m_intake.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
