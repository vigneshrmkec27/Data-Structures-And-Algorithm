// User function Template for Java

class BrowserHistory {
    // constructor to initialize object with homepage
    List<String>res=new ArrayList<>();
    int currindex=0;
    BrowserHistory(String homepage) {
        res.add(homepage);
        currindex=0;
    }

    // visit current url
    void visit(String url) {
        while(res.size()>currindex+1)
        {
            res.remove(res.size()-1);
        }
        res.add(url);
        currindex++;
    }

    // 'steps' move backward in history and return current page
    String back(int steps) {
        while(steps>0 && currindex>0)
        {
            currindex--;
            steps--;
        }
        return res.get(currindex);
    }

    // 'steps' move forward and return current page
    String forward(int steps) {
        while(steps>0 && currindex<res.size()-1)
        {
            currindex++;
            steps--;
        }
        return res.get(currindex);
    }
}