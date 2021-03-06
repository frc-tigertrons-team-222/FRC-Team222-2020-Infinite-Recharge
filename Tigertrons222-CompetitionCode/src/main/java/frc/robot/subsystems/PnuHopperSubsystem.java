/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kForward;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kReverse;

/**
 * A hatch mechanism actuated by a single {@link DoubleSolenoid}.
 */
public class PnuHopperSubsystem extends SubsystemBase {
  private final DoubleSolenoid m_hopper = new DoubleSolenoid(RobotMap.HOPPER_SOLENOID_MODULE, RobotMap.HOPPER_SOLENOID_DEPLOY, RobotMap.HOPPER_SOLENOID_RETRACT);

  /**
   * Grabs the hatch.
   */
  public void deploySolenoid() {
    m_hopper.set(kForward);
  }

  /**
   * Releases the hatch.
   */
  public void retractSolenoid() {
    m_hopper.set(kReverse);
  }
}