package com.ysr.api;

/**
 * Created by yangshirong on 2017/3/6 9:21.
 * 邮箱 ysr200808@163.com
 */

public class HostType {
    /**
     * 多少种Host类型
     */
    public static final int TYPE_COUNT = 3;
    /**
     * 登录接口
     */
    public static final int TYPE_LOGIN = 1;
    /**
     * 接收数据接口
     */
    public static final int TYPE_UPDATE = 2;
    /**
     * 发送数据
     */
    public static final int TYPE_COMMIT = 0;
    /**
     * 防护设施类型({"防护门", "密闭门", "防护密闭门", "密闭屏蔽门"};)
     */
    public static final int TYPE_FHSS_ONE = 0x001;
    /**
     * 防护设施类型(防爆破活门,悬板活门)
     */
    public static final int TYPE_FHSS_TWO = 0x02;
    /**
     * 防护设施类型(挡窗板)
     */
    public static final int TYPE_FHSS_THREE = 0x003;
    /**
     * 空数据
     */
    public static final int TYPE_NOTHING = 0x004;
    /**
     * 通风设备
     */
    public static final int TYPE_TFSB_ONE = 0x005;
    public static final int TYPE_TFSB_TWO = 0x006;
    public static final int TYPE_TFSB_THREE = 0x007;
    public static final int TYPE_TFSB_FOUR = 0x008;
    public static final int TYPE_TFSB_FIVE = 0x009;
    public static final int TYPE_TFSB_SIX = 0x010;
    public static final int TYPE_TFSB_SEVEN = 0x011;
    public static final int TYPE_TFSB_EIGHT = 0x012;

    /**
     * 给排水设备
     */
    public static final int TYPE_JPSSB_ONE = 0x013;
    public static final int TYPE_JPSSB_TWO = 0x014;
    public static final int TYPE_JPSSB_THREE = 0x015;
    public static final int TYPE_JPSSB_FOUR = 0x016;
    public static final int TYPE_JPSSB_FIVE = 0x017;
    public static final int TYPE_JPSSB_SIX = 0x018;
    public static final int TYPE_JPSSB_SEVEN = 0x019;
    public static final int TYPE_JPSSB_EIGHT = 0x020;
    public static final int TYPE_JPSSB_NINE = 0x021;

}
