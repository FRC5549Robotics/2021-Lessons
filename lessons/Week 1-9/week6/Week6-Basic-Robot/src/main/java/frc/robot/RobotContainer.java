/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.commands.*;
import frc.robot.subsystems.*;


public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drivetrain m_drivetrain = new Drive();
  private final Intake m_intake = new Intake();

  public static Joystick joystick = new Joystick(0);

  public static double joystickAxis = joystick.getRawAxis(0);
  public static double joystickRotation = joystick.getRawAxis(1);
  
  JoystickButton button = new JoystickButton(joystick, 0);
  JoystickButton button = new JoystickButton(joystick, 1);


  public RobotContainer() {
    configureButtonBindings();
  }


  private void configureButtonBindings() {
    drivetrain.setDefaultCommand(new Drive(m_drivetrain, joystickAxis, joystickRotation));
    button1.whenPressed(new intakeBall(m_intake))
    button2.whenPressed(new outputBall(m_intake))
  }


  public Command getAutonomousCommand() {
    return m_autoCommand;
  }
}
