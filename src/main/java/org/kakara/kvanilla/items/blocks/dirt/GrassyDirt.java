package org.kakara.kvanilla.items.blocks.dirt;

import org.kakara.core.annotations.Key;
import org.kakara.core.annotations.Name;
import org.kakara.core.annotations.Texture;
import org.kakara.core.events.entity.StepOnEvent;
import org.kakara.core.events.player.PlaceEvent;
import org.kakara.core.events.player.click.ClickEvent;
import org.kakara.core.mod.Mod;
import org.kakara.kvanilla.bases.DirtBase;

@Name("Grassy Dirt")
@Texture("textures/items/blocks/dirt/grassy_dirt.png")
@Key("grassy_dirt")

public class GrassyDirt extends DirtBase {
    public GrassyDirt(Mod mod) {
        super(mod);
    }

    @Override
    public void onStep(StepOnEvent event) {

    }

    @Override
    public void onPlace(PlaceEvent event) {

    }

    @Override
    public void onClick(ClickEvent clickEvent) {

    }
}