package l2f.gameserver.network.serverpackets;

import org.napile.primitive.maps.IntObjectMap;

import l2f.gameserver.model.Player;

/**
 * @author VISTALL
 * @update 00:51/19.02.2018
 */
public class ExReceiveShowPostFriend extends L2GameServerPacket
{
	private IntObjectMap<String> _list;

	public ExReceiveShowPostFriend(Player player)
	{
		_list = player.getPostFriends();
	}

	@Override
	public void writeImpl()
	{
   		writeEx(0xD3);
		writeD(_list.size());
		for (String t : _list.values())
			writeS(t);
	}
}
