/*
 * Copyright 2018 IBM Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
*/

package com.roguecloud.utils;

import com.roguecloud.items.ArmourSet;
import com.roguecloud.items.Weapon;

/** Utility class for randomly generating monsters within a given level range */
public class MonsterFactory {

	public MonsterFactoryResult generate(int lowLevel, int highLevel) {
		
		MonsterFactoryResult result = new MonsterFactoryResult();
		
		int level = lowLevel+((int)((highLevel-lowLevel)*Math.random()));
		
		result.level = level;
		
		return result;
	}

	
	/** Statistics to use for a new monster */
	@SuppressWarnings("unused")
	public static class MonsterFactoryResult {
		private int level;

		private int maxHp;
		
		private Weapon weapon;
		private ArmourSet armour = new ArmourSet();
		
		public int getLevel() {
			return level;
		}
	}
}
