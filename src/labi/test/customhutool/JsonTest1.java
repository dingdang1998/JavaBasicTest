package labi.test.customhutool;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * @program: JavaBasicTest
 * @description:
 * @author: dzp
 * @create: 2021-12-21 09:53
 **/
public class JsonTest1 {

    /**
     * 只读桶配置json数据
     */
    public static final String READ_ONLY = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"AWS\":[\"*\"]},\"Action\":[\"s3:GetBucketLocation\"],\"Resource\":[\"arn:aws:s3:::macro\"]},{\"Effect\":\"Allow\",\"Principal\":{\"AWS\":[\"*\"]},\"Action\":[\"s3:ListBucket\"],\"Resource\":[\"arn:aws:s3:::macro\"],\"Condition\":{\"StringEquals\":{\"s3:prefix\":[\"*.*\"]}}},{\"Effect\":\"Allow\",\"Principal\":{\"AWS\":[\"*\"]},\"Action\":[\"s3:GetObject\"],\"Resource\":[\"arn:aws:s3:::macro/*.**\"]}]}";

    public static void main(String[] args) {
        JSONObject readOnly = JSONUtil.parseObj(READ_ONLY);
        System.out.println(readOnly);
    }
}
