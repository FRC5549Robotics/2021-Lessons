/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class ArcadeDrive extends CommandBase {
  private final Drivetrain m_drivetrain;
  private double m_move, m_rotate;

  // Takes Doubles due to the WPILib Arcade Drive Method
  public ArcadeDrive(Drivetrain drivetrain, double move, double rotate) {
    m_drivetrain = drivetrain;
    m_move = move;
    m_rotate = rotate;
    addRequirements(drivetrain);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    m_drivetrain.drive(m_move, m_rotate);
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
