/*
 * Copyright 2012 Christian Kuetbach ckuetbach@gmail.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwtmock.client;

import com.googlecode.mgwt.dom.client.event.animation.*;

/**
 * @author ckue
 *
 */
public class MockTransitionEndEvent extends TransitionEndEvent {

	private static com.google.gwt.event.dom.client.DomEvent.Type<TransitionEndHandler> MOCKTYPE = new Type<TransitionEndHandler>("animationEnd", new MockTransitionEndEvent());

	public static Type<TransitionEndHandler> getType() {
		return MOCKTYPE;
	}

	@Override
	public com.google.gwt.event.dom.client.DomEvent.Type<TransitionEndHandler> getAssociatedType() {
		return MOCKTYPE;
	}
}
