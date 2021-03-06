/*******************************************************************************
 * Copyright 2013 Università degli Studi di Firenze
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package it.drwolf.ridire.util.fixingpos;

import java.io.Serializable;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Name("posFixer")
@Scope(ScopeType.CONVERSATION)
public class PosFixer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3193283593060825881L;

	private String file;
	private String destDir;
	private String reverseDestDir;

	@In(create = true)
	private PosFixerData posFixerData;
	@In(create = true)
	private AsyncPosFixer asyncPosFixer;

	public void doFix() {
		this.posFixerData.setFile(this.getFile());
		this.posFixerData.setDestDir(this.getDestDir());
		this.posFixerData.setReverseDestDir(this.reverseDestDir);
		this.asyncPosFixer.doAsyncFix(this.posFixerData);
	}

	public String getDestDir() {
		return this.destDir;
	}

	public String getFile() {
		return this.file;
	}

	public PosFixerData getPosFixerData() {
		return this.posFixerData;
	}

	public String getReverseDestDir() {
		return this.reverseDestDir;
	}

	public void setDestDir(String destDir) {
		this.destDir = destDir;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setPosFixerData(PosFixerData posFixerData) {
		this.posFixerData = posFixerData;
	}

	public void setReverseDestDir(String reverseDestDir) {
		this.reverseDestDir = reverseDestDir;
	}

}
