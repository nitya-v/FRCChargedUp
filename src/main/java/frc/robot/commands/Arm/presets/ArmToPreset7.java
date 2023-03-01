// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Arm.presets;

import frc.robot.subsystems.Arm;
import frc.robot.testingdashboard.TestingDashboard;


public class ArmToPreset7 extends ArmToPreset {

  /** Creates a new ArmToPreset. */
  public ArmToPreset7(double turretAngle, double shoulderAngle, double elbowAngle, double wristAngle) {
    super(turretAngle, shoulderAngle, elbowAngle, wristAngle);
  }

  public static void registerWithTestingDashboard() {
    Arm arm = Arm.getInstance();
    ArmToPreset7 cmd = new ArmToPreset7(0, 0, 0, 0);
    TestingDashboard.getInstance().registerCommand(arm, "Automatic", cmd);
  }

}