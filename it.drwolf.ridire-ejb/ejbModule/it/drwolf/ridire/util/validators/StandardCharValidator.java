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
package it.drwolf.ridire.util.validators;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.faces.Validator;
import org.jboss.seam.annotations.intercept.BypassInterceptors;

@Name("standardCharValidator")
@BypassInterceptors
@Validator
public class StandardCharValidator implements javax.faces.validator.Validator {

        public void validate(FacesContext context, UIComponent component,
                        Object value) throws ValidatorException {

                if (context == null || component == null) {
                        throw new NullPointerException();
                }
                if (null == value || 0 == value.toString().length()) {
                        return;
                }
                
                
                /*Check for non letters or numbers chars */
                String stringa = new String(value.toString());
                if (!stringa.matches("^a-z$")){
                    FacesMessage message = new FacesMessage();
                    message.setDetail("Usare solo lettere e numeri");
                    message.setSummary("a-z0-9 exception");
                    message.setSeverity(FacesMessage.SEVERITY_ERROR);						
					throw new ValidatorException(message);                	
                }
                

        }
}
