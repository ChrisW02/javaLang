import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LotteryTest {
    public List<String> getHeadNumber() {
        List<String> list = new ArrayList<String>();

        String lotteryNumber = "";
        for (int i = 1; i < 36; i++) {
            if (i < 10) {
                list.add("0" + i + " ");
            } else {
                list.add("" + i + " ");
            }
        }
        int roundIndex;

        List<String> lotteryList = new ArrayList<String>();
        for (int j = 0; j < 5; j++) {
            int amount = list.size(); // 获取前半段号码的个数
            Random r = new Random(); // 创建并实例化 Random 的对象
            roundIndex = r.nextInt(amount); // 获取一个 0 到 amount-1 的随机数
            lotteryNumber = list.get(roundIndex); // 获取彩票数字，即摇号的号码
            lotteryList.add(lotteryNumber); // 将彩票号码添加 lotteryList 中
            list.remove(roundIndex); // 移除刚刚产生的号码
        }
        Collections.sort(lotteryList);
        // 对前半段号码进行排序，排序的目的是为了让结果更具可读性
        return lotteryList;
        // 返回前半段号码
    }

    public List<String> getRearNumber() {
        List<String> list = new ArrayList<>();
        String lotteryNumber = "";
        for (int i = 1; i < 13; i++) {
            if (i < 10) {list.add("0" + i + "  ");}
            else {list.add("" + i + "  ");}
        }
        int roundIndex;

        List<String> lotteryList = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            int amount = list.size();
            Random r = new Random();
            roundIndex = r.nextInt(amount);
            lotteryNumber = list.get(roundIndex);
            lotteryList.add(lotteryNumber);
            list.remove(roundIndex);
        }

        Collections.sort(lotteryList);
        return lotteryList;
    }

    public void generateLottery(String groupNum) {
        int groupNumber = Integer.parseInt(groupNum);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < groupNumber; i++) {
            List<String> startList = getHeadNumber();
            List<String> endList = getRearNumber();
            for (String s : startList) {sb.append(s);}
            sb.append("    ");
            for (String s : endList) {sb.append(s);}
            sb.append("\n");
            System.out.println(sb);
        }
    }
}
