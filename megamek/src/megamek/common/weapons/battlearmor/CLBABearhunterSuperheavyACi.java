/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 24, 2004
 *
 */
package megamek.common.weapons.battlearmor;

import megamek.common.AmmoType;
import megamek.common.TechConstants;
import megamek.common.WeaponType;
import megamek.common.weapons.Weapon;

/**
 * @author Andrew Hunter, Harold "BATTLEMASTER IIC" N.
 */
public class CLBABearhunterSuperheavyACi extends Weapon {
    /**
     *
     */
    private static final long serialVersionUID = -1042154309245048380L;

    /**
     *
     */
    public CLBABearhunterSuperheavyACi() {
        super();

        name = "Machine Gun (Bearhunter ACi)";
        setInternalName(name);
        addLookupName("CLBearhunter Superheavy ACi");
        addLookupName("CLBearhunterSuperheavyACi");
        heat = 0;
        damage = 5;
        infDamageClass = WeaponType.WEAPON_BURST_3D6;
        baDamageClass = WeaponType.WEAPON_BURST_3D6;
        ammoType = AmmoType.T_NA;
        toHitModifier = 1;
        shortRange = 0;
        mediumRange = 1;
        longRange = 2;
        extremeRange = 2;
        tonnage = 0.15f;
        criticals = 2;
        bv = 9;
        flags = flags.or(F_DIRECT_FIRE).or(F_NO_FIRES).or(F_BALLISTIC)
                .or(F_BA_WEAPON).or(F_BURST_FIRE);
        introDate = 3065;
        techLevel.put(3065, TechConstants.T_CLAN_UNOFFICIAL);
        availRating = new int[] { RATING_X, RATING_X, RATING_F, RATING_F };
        techRating = RATING_D;

    }

}
