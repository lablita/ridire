package pdfcleaner;

public abstract class Filter
{
    public Filter(String x)
    {
        lines = x.split("\n");
    }

    String[] lines;

    public String readLine(int i)
    {
        if (i < 0 || i >= lines.length)
        {
            return null;
        }
        return lines[i];
    }

    public String toString()
    {
        String x = "";
        for (int i = 0; i < lines.length; i++)
        {
            if (lines[i] != null && lines[i].length() > 0)
            {
                x = x + lines[i] + "\n";
            }
        }
        return x;
    }

    protected abstract void apply();
}
