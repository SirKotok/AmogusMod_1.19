package net.sirkotok.firstmod.Item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.sirkotok.firstmod.sound.ModSounds;


public class Talkingmogusitem extends Item {
    public Talkingmogusitem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext){
        if (pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();
            BlockPos positionclicked = pContext.getClickedPos();
            player.sendSystemMessage(Component.literal("AMOGUS"));
            pContext.getLevel().playSound(player, positionclicked, ModSounds.AMOGUS_SOUND.get(), SoundSource.BLOCKS, 1f, 1f);
        }
        return super.useOn(pContext);

    }
}

