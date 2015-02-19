/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package Packet;

import java.awt.Color;

import packet.Packet;
import enumeration.EnumSurface;

public interface PacketQal extends Packet {
	public Color getColor(EnumSurface surface);
}
