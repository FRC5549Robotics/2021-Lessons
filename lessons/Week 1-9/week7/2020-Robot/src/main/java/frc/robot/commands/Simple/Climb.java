/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.Climber;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class Climb extends CommandBase {
  private final Climber m_climber;

  // Takes Doubles due to the WPILib Arcade Drive Method
  public Climb(Climber climber) {
    m_climber = climber;
    addRequirements(climber);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    m_climber.run();
  }

  @Override
  public void end(boolean interrupted) {
    m_climber.end();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
