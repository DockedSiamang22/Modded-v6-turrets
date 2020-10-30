ripple = new ItemTurret("Quake"){{
            requirements(Category.turret, with(Items.copper, 150, Items.graphite, 135, Items.titanium, 60, Items.lead, 100));
            ammo(
            Items.graphite, Bullets.artilleryDense,
            Items.silicon, Bullets.artilleryHoming,
            Items.pyratite, Bullets.artilleryIncendiary,
            Items.blastCompound, Bullets.artilleryExplosive,
            Items.plastanium, Bullets.artilleryPlastic
            );

            targetAir = false;
            size = 5;
            shots = 12;
            inaccuracy = 8f;
            reloadTime = 60f;
            ammoEjectBack = 5f;
            ammoUseEffect = Fx.shellEjectBig;
            ammoPerShot = 2;
            cooldown = 0.03f;
            velocityInaccuracy = 0.2f;
            restitution = 0.02f;
            recoilAmount = 6f;
            shootShake = 2f;
            range = 420f;
            minRange = 30f;

            health = 130 * size * size;
            shootSound = Sounds.artillery;
