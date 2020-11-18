/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj2.command.Command;
// Subsystems
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Climber;
// Commands
import frc.robot.commands.Simple.ArcadeDrive;
import frc.robot.commands.Simple.Climb;
import frc.robot.commands.Simple.Index;
import frc.robot.commands.Simple.Intake;
import frc.robot.commands.Simple.Shoot;
import frc.robot.commands.Complex.ShootTarget;


public class RobotContainer {
  // Subsystems
  private final Drivetrain m_drivetrain = new Drivetrain();
  private final Indexer m_indexer = new Indexer();
  private final Intake m_intake = new Intake();
  private final Shooter m_shooter = new Shooter();
  private final Climber m_climber = new Climber();

  // Joystick
  private static Joystick joystick = new GenericHID(0);

  // Axis
  private static double move = new joystick.getRawAxis(0);
  private static double rotate = new joystick.getRawAxis(2);

  // Buttons
  private static Button button1 = new joystick.getRawButton(0);
  private static Button button2 = new joystick.getRawButton(1);
  private static Button button3 = new joystick.getRawButton(2);
  private static Button button4 = new joystick.getRawButton(3);


  // Simple Commands
  private final ArcadeDrive arcade = new ArcadeDrive(m_drivetrain, move, rotate);
  private final Index index = new Index(m_indexer);
  private final Intake intake = new Intake(m_intake); // May Cause Conflict due to Two "Intake" Classes
  private final Shoot shoot = new Shoot(m_shooter);
  private final Climb climb = new Climb(m_climber);

  // Complex Commands
  private final ShootTarget shoottarget = new ShootTarget(m_shooter, m_intake, m_indexer);

  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    drivetrain.setDefaultCommand(arcade);
    button1.whenPressed(intake);
    button2.whenPressed(index);
    button3.whenPressed(climb);
    button4.whenPressed(shoottarget);
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
