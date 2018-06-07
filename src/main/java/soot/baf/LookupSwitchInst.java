package soot.baf;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1999 Patrick Lam, Patrick Pominville and Raja Vallee-Rai
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import java.util.List;

import soot.Unit;
import soot.UnitBox;
import soot.jimple.IntConstant;

public interface LookupSwitchInst extends Inst {
  public Unit getDefaultTarget();

  public void setDefaultTarget(Unit defTarget);

  public UnitBox getDefaultTargetBox();

  public void setLookupValue(int index, int value);

  public int getLookupValue(int index);

  public List<IntConstant> getLookupValues();

  public void setLookupValues(List<IntConstant> values);

  public int getTargetCount();

  public Unit getTarget(int index);

  public UnitBox getTargetBox(int index);

  public void setTarget(int index, Unit target);

  public List<Unit> getTargets();

  public void setTargets(List<Unit> targets);
}
