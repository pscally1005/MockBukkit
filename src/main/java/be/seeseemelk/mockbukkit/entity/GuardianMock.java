package be.seeseemelk.mockbukkit.entity;

import be.seeseemelk.mockbukkit.ServerMock;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Guardian;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Mock implementation of a {@link Guardian}.
 *
 * @see MonsterMock
 */
public class GuardianMock extends MonsterMock implements Guardian
{

	private boolean laser = false;

	/**
	 * Constructs a new  on the provided {@link ServerMock} with a specified {@link UUID}.
	 *
	 * @param server The server to create the entity on.
	 * @param uuid   The UUID of the entity.
	 */
	public GuardianMock(@NotNull ServerMock server, @NotNull UUID uuid)
	{
		super(server, uuid);
	}

	@Override
	public boolean setLaser(boolean activated)
	{
		if (this.getTarget() == null)
		{
			return false;
		}

		this.laser = activated;
		return activated;
	}

	@Override
	public boolean hasLaser()
	{
		return this.laser;
	}

	@Override
	public boolean isElder()
	{
		return false;
	}

	@Override
	public void setElder(boolean shouldBeElder)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public @NotNull EntityType getType()
	{
		return EntityType.GUARDIAN;
	}

}
