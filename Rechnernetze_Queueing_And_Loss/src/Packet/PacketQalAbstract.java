/**
 * @author:	Stefan Otto G�nther
 * @date:	09.09.2014
 */

package Packet;

import java.awt.Color;

import packet.PacketAbstract;
import enumeration.EnumSurface;


public abstract class PacketQalAbstract extends PacketAbstract implements PacketQal {

	public PacketQalAbstract(Integer position) {
		super(position);
	}	
	
	@Override
	public void doStep() {
		this.position += step;
	}
	
	protected abstract Color getColoredColor();
	
	@Override
	public Color getColor(EnumSurface surface) {
		try {
			if (surface == null) {
				throw new NullPointerException();
			}
			if (surface == EnumSurface.COLORED) {
				return this.getColoredColor();
			} else {
				return Color.GRAY;
			}
		} catch (Exception ex) {
			throw ex;
		}
	}
}
