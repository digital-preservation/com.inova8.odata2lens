package com.inova8.odata2lens;

public class NavigationProperty {
	private String name;
	private String targetEntityType;
	private String label;
	private String tooltip;
	private String range;
	private String subTypeName;
	private String icon;
	private EntityType rangeType;

	public NavigationProperty(String name, String label, String tooltip, String targetEntityType, String range,
			String icon) {
		this.name = name;
		this.label = label;
		this.tooltip = tooltip;
		this.targetEntityType = targetEntityType;
		this.range = range;
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public String getTargetEntityType() {
		return targetEntityType;
	}

	public String getLabel() {
		return label;
	}

	public String getTooltip() {
		return tooltip;
	}

	public String getRange() {

		return range;
	}

	public String getSubTypeName() {

		return subTypeName;
	}
	public void setSubTypeName(String subTypeName) {
		this.subTypeName = subTypeName;
	}

	public String getIcon() {
		if ( (icon == null || icon.isEmpty()) && rangeType != null) {
			return rangeType.getEntity().getTargetIcon();
		} else {
			return icon==null?"":icon;
		}
	}

	void setIcon(String icon) {
		this.icon = icon;
	}

	public void setRangeType(EntityType entityType) {
		this.rangeType = entityType;

	}

	public EntityType getRangeType() {
		return rangeType;
	}

}
