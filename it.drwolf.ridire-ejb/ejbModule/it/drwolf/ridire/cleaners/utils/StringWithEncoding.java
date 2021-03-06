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
package it.drwolf.ridire.cleaners.utils;

public class StringWithEncoding {
	private String string;
	private String encoding;
	private String cleaner;

	public StringWithEncoding(String string, String encoding) {
		super();
		this.string = string;
		this.encoding = encoding;
	}

	public String getCleaner() {
		return this.cleaner;
	}

	public String getEncoding() {
		return this.encoding;
	}

	public String getString() {
		return this.string;
	}

	public void setCleaner(String cleaner) {
		this.cleaner = cleaner;
	}
}
