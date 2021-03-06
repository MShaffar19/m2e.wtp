/*******************************************************************************
 * Copyright (c) 2008-2014 Sonatype, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.eclipse.m2e.wtp.internal.preferences;

import org.eclipse.m2e.wtp.preferences.IMavenWtpPreferences;


/**
 * MavenWtpProjectPreferences
 *
 * @author Fred Bricon
 */
public class MavenWtpPreferencesImpl implements IMavenWtpPreferences {
   
  private boolean isEnabled;

  private boolean isApplicationXmGeneratedInBuildDirectory;
  
  private boolean isEnabledProjectSpecificSettings; 
  
  private boolean isWebMavenArchiverUsesBuildDirectory;
  
  @Override
  public boolean isApplicationXmGeneratedInBuildDirectory() {
    return isApplicationXmGeneratedInBuildDirectory;
  }

  /**
   * @see org.eclipse.m2e.wtp.preferences.IMavenWtpPreferences#setApplicationXmGeneratedInBuildDirectory(boolean)
   */
  @Override
  public void setApplicationXmGeneratedInBuildDirectory(boolean isEnabled) {
    isApplicationXmGeneratedInBuildDirectory = isEnabled;
  }

  /**
   * @see org.eclipse.m2e.wtp.preferences.IMavenWtpPreferences#isEnabledProjectSpecificSettings()
   */
  @Override
  public boolean isEnabledProjectSpecificSettings() {
    return isEnabledProjectSpecificSettings;
  }

  /**
   * @see org.eclipse.m2e.wtp.preferences.IMavenWtpPreferences#setEnabledProjectSpecificSettings(boolean)
   */
  @Override
  public void setEnabledProjectSpecificSettings(boolean isEnabled) {
    isEnabledProjectSpecificSettings = isEnabled;    
  }

  /**
   * @return Returns the isWebMavenArchiverUsesBuildDirectory.
   */
  @Override
  public boolean isWebMavenArchiverUsesBuildDirectory() {
    return isWebMavenArchiverUsesBuildDirectory;
  }

  /**
   * @param isWebMavenArchiverUsesBuildDirectory The isWebMavenArchiverUsesBuildDirectory to set.
   */
  @Override
  public void setWebMavenArchiverUsesBuildDirectory(boolean isWebMavenArchiverUsesBuildDirectory) {
    this.isWebMavenArchiverUsesBuildDirectory = isWebMavenArchiverUsesBuildDirectory;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (isApplicationXmGeneratedInBuildDirectory ? 1231 : 1237);
    result = prime * result + (isEnabledProjectSpecificSettings ? 1231 : 1237);
    result = prime * result + (isWebMavenArchiverUsesBuildDirectory ? 1231 : 1237);
    result = prime * result + (isEnabled ? 1231 : 1237);
    return result;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;
    if(obj == null)
      return false;
    if(getClass() != obj.getClass())
      return false;
    MavenWtpPreferencesImpl other = (MavenWtpPreferencesImpl) obj;
    if(isApplicationXmGeneratedInBuildDirectory != other.isApplicationXmGeneratedInBuildDirectory)
      return false;
    if(isEnabledProjectSpecificSettings != other.isEnabledProjectSpecificSettings)
      return false;
    if(isWebMavenArchiverUsesBuildDirectory != other.isWebMavenArchiverUsesBuildDirectory)
      return false;
    if(isEnabled != other.isEnabled)
        return false;
    return true;
  }

  @Override
  public boolean isEnabled() {
	return isEnabled;
  }

  @Override
  public void setEnabled(boolean isEnabled) {
	this.isEnabled = isEnabled;
  }

}
