//
// Copyright 2010 GOT5 (Gang Of Tapestry 5)
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// 	http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.got5.tapestry5.jquery.pages.components;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.OnEvent;
import org.got5.tapestry5.jquery.utils.JQueryTabData;


public class DocsSuperFish{
	
	@OnEvent(value=EventConstants.ACTION, component="action")
	public void testActionLink(){
		System.out.println("test Action Link");
	}
	
	public List<JQueryTabData> getListTabData()
	{
		List<JQueryTabData> listTabData = new ArrayList<JQueryTabData>();
		
	    listTabData.add(new JQueryTabData("Documentation","docs"));
	    
	    listTabData.add(new JQueryTabData("Example","example"));
	    
	    return listTabData;
	} 
	
	
}