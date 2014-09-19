/**
 *  Copyright 2009, 2010 The Regents of the University of California
 *  Licensed under the Educational Community License, Version 2.0
 *  (the "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at
 *
 *  http://www.osedu.org/licenses/ECL-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */

package org.opencastproject.composer.impl;

import org.opencastproject.composer.api.EncoderListener;
import org.opencastproject.composer.api.EncodingProfile;

import java.io.File;

/**
 * Callback for events generated by the {@link AbstractCmdlineEncoderEngine}.
 */
public interface CmdlineEncoderListener extends EncoderListener {

  /**
   * Notifies the listener of any console output from the encoder either to stdin or stderr.
   *
   * @param file
   *          the files that are being encoded
   * @param format
   *          the encoder format in use
   * @param message
   *          the output message
   */
  void notifyEncoderOutput(EncodingProfile format, String message, File... file);

}
