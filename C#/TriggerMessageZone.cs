using UnityEngine;
using UnityEngine.UI;

public class TriggerMessageZone : MonoBehaviour
{
    public GameObject messageUI; // 보여줄 텍스트 오브젝트
    private void OnTriggerEnter(Collider other)
    {
        if (other.CompareTag("Player"))
        {
            Debug.Log("트리거 안으로 들어옴");
            messageUI.SetActive(true);
        }
    }

    private void OnTriggerExit(Collider other)
    {
        if (other.CompareTag("Player"))
        {
            Debug.Log("트리거에서 나감");
            messageUI.SetActive(false);
        }
    }
}